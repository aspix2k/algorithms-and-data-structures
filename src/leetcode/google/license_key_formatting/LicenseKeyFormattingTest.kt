package leetcode.google.license_key_formatting

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.time.ExperimentalTime

class LicenseKeyFormattingTest {

    @Test
    @ExperimentalTime
    fun test0() {
        assertEquals(
            expected = "5F3Z-2E9W",
            actual = formatLicenseKey("5F3Z-2e-9-w", 4)
        )
    }

    @Test
    fun test1() {
        assertEquals(
            expected = "2-5G-3J",
            actual = formatLicenseKey("2-5g-3-J", 2)
        )
    }
}