package classFieldsPost.attachments

interface Attachments {
    val type: String

}
private var attachmentsAdd = emptyArray<Attachments>()
fun addAttachments(attachments: Attachments): Array<Attachments> {
    attachmentsAdd += attachments
    return attachmentsAdd
}
