package classFieldsPost.attachments

class NotesAttachments(
    override val type: String = "Notes",
    val notes: NotesAttachments = NotesAttachments()
) : Attachments