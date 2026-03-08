package seedu.address.testutil;

import java.util.HashSet;
import java.util.Set;

import seedu.address.model.application.Address;
import seedu.address.model.application.Application;
import seedu.address.model.application.ApplicationDate;
import seedu.address.model.application.Company;
import seedu.address.model.application.Phone;
import seedu.address.model.tag.Tag;
import seedu.address.model.util.SampleDataUtil;

/**
 * A utility class to help with building Application objects.
 */
public class ApplicationBuilder {

    public static final String DEFAULT_COMPANY = "Amy Bee";
    public static final String DEFAULT_PHONE = "85355255";
    public static final String DEFAULT_APPLICATION_DATE = "2026-03-09";
    public static final String DEFAULT_ADDRESS = "123, Jurong West Ave 6, #08-111";

    private Company company;
    private Phone phone;
    private ApplicationDate applicationDate;
    private Address address;
    private Set<Tag> tags;

    /**
     * Creates a {@code ApplicationBuilder} with the default details.
     */
    public ApplicationBuilder() {
        company = new Company(DEFAULT_COMPANY);
        phone = new Phone(DEFAULT_PHONE);
        applicationDate = new ApplicationDate(DEFAULT_APPLICATION_DATE);
        address = new Address(DEFAULT_ADDRESS);
        tags = new HashSet<>();
    }

    /**
     * Initializes the ApplicationBuilder with the data of {@code applicationToCopy}.
     */
    public ApplicationBuilder(Application applicationToCopy) {
        company = applicationToCopy.getCompany();
        phone = applicationToCopy.getPhone();
        applicationDate = applicationToCopy.getApplicationDate();
        address = applicationToCopy.getAddress();
        tags = new HashSet<>(applicationToCopy.getTags());
    }

    /**
     * Sets the {@code Company} of the {@code Application} that we are building.
     */
    public ApplicationBuilder withCompany(String company) {
        this.company = new Company(company);
        return this;
    }

    /**
     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code Application} that we are building.
     */
    public ApplicationBuilder withTags(String ... tags) {
        this.tags = SampleDataUtil.getTagSet(tags);
        return this;
    }

    /**
     * Sets the {@code Address} of the {@code Application} that we are building.
     */
    public ApplicationBuilder withAddress(String address) {
        this.address = new Address(address);
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code Application} that we are building.
     */
    public ApplicationBuilder withPhone(String phone) {
        this.phone = new Phone(phone);
        return this;
    }

    /**
     * Sets the {@code ApplicationDate} of the {@code Application} that we are building.
     */
    public ApplicationBuilder withApplicationDate(String applicationDate) {
        this.applicationDate = new ApplicationDate(applicationDate);
        return this;
    }

    public Application build() {
        return new Application(company, phone, applicationDate, address, tags);
    }

}
