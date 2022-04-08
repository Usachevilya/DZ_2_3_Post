package classFieldsPost.attachments

class VideoAttachments(
    override val type: String = "Video",
    val video: VideoAttachments = VideoAttachments()
) : Attachments