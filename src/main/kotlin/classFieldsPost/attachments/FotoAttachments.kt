package classFieldsPost.attachments

data class FotoAttachments(
    override val type: String = "Foto",
    val foto: FotoAttachments = FotoAttachments()
) : Attachments
