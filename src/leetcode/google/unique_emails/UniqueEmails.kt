package leetcode.google.unique_emails

fun findUniqueEmails(emails: Array<String>): Int {
    val uniqueEmails = mutableSetOf<String>()

    val atSign = '@'
    val plusSign = '+'
    val dotSign = '.'

    for (email in emails) {
        email
            .split(atSign)
            .let { list -> list[0] to list[1] }
            .let { parts ->
                val localPart = parts.first
                val domainPart = parts.second
                val processedEmail = StringBuilder()

                innerLoop@ for (char in localPart) {
                    when (char) {
                        dotSign -> continue@innerLoop
                        plusSign -> break@innerLoop
                        else -> processedEmail.append(char)
                    }
                }
                processedEmail.append(atSign)
                processedEmail.append(domainPart)

                uniqueEmails.add(processedEmail.toString())
            }
    }

    return uniqueEmails.size
}