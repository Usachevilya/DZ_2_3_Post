package classFieldsPost.attachments

data class AudioAttachments(
    override val type: String = "Audio",
    val audio: Audio
) : Attachments
