package classFieldsPost.attachments

interface Attachments {
    val name: String

}
private var attachmentsAdd = emptyArray<Attachments>()
fun addAttachments(attachments: Attachments): Array<Attachments> {
    attachmentsAdd += attachments
    return attachmentsAdd
}
