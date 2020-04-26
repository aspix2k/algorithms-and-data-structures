package leetcode.google.unique_emails

import org.junit.Test
import kotlin.test.assertEquals

class UniqueEmailsTest {

    @Test
    fun test() {
        assertEquals(
            2,
            findUniqueEmails(
                arrayOf(
                    "test.email+alex@leetcode.com",
                    "test.e.mail+bob.cathy@leetcode.com",
                    "testemail+david@lee.tcode.com"
                )
            )
        )
    }
}