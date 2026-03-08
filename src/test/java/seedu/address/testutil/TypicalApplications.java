package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_APPLICATION_DATE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_APPLICATION_DATE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_COMPANY_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_COMPANY_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.application.Application;

/**
 * A utility class containing a list of {@code Application} objects to be used in tests.
 */
public class TypicalApplications {

    public static final Application ALICE = new ApplicationBuilder().withCompany("Alice Pauline")
            .withAddress("123, Jurong West Ave 6, #08-111").withApplicationDate("2026-01-01")
            .withPhone("94351253")
            .withTags("friends").build();
    public static final Application BENSON = new ApplicationBuilder().withCompany("Benson Meier")
            .withAddress("311, Clementi Ave 2, #02-25")
            .withApplicationDate("2026-01-02").withPhone("98765432")
            .withTags("owesMoney", "friends").build();
    public static final Application CARL = new ApplicationBuilder().withCompany("Carl Kurz").withPhone("95352563")
            .withApplicationDate("2026-01-03").withAddress("wall street").build();
    public static final Application DANIEL = new ApplicationBuilder().withCompany("Daniel Meier").withPhone("87652533")
            .withApplicationDate("2026-01-04").withAddress("10th street").withTags("friends").build();
    public static final Application ELLE = new ApplicationBuilder().withCompany("Elle Meyer").withPhone("9482224")
            .withApplicationDate("2026-01-05").withAddress("michegan ave").build();
    public static final Application FIONA = new ApplicationBuilder().withCompany("Fiona Kunz").withPhone("9482427")
            .withApplicationDate("2026-01-06").withAddress("little tokyo").build();
    public static final Application GEORGE = new ApplicationBuilder().withCompany("George Best").withPhone("9482442")
            .withApplicationDate("2026-01-07").withAddress("4th street").build();

    // Manually added
    public static final Application HOON = new ApplicationBuilder().withCompany("Hoon Meier").withPhone("8482424")
            .withApplicationDate("2026-01-08").withAddress("little india").build();
    public static final Application IDA = new ApplicationBuilder().withCompany("Ida Mueller").withPhone("8482131")
            .withApplicationDate("2026-01-09").withAddress("chicago ave").build();

    // Manually added - Application's details found in {@code CommandTestUtil}
    public static final Application AMY = new ApplicationBuilder().withCompany(VALID_COMPANY_AMY)
            .withPhone(VALID_PHONE_AMY)
            .withApplicationDate(VALID_APPLICATION_DATE_AMY).withAddress(VALID_ADDRESS_AMY)
            .withTags(VALID_TAG_FRIEND).build();
    public static final Application BOB = new ApplicationBuilder().withCompany(VALID_COMPANY_BOB)
            .withPhone(VALID_PHONE_BOB)
            .withApplicationDate(VALID_APPLICATION_DATE_BOB).withAddress(VALID_ADDRESS_BOB)
            .withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalApplications() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical applications.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Application application : getTypicalApplications()) {
            ab.addApplication(application);
        }
        return ab;
    }

    public static List<Application> getTypicalApplications() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
