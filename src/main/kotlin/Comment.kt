import classFieldsPost.attachments.Attachments

class Comment (
    val owner_id: Int,
    val post_id: Int,
    val from_group: Int,
    val message: String,
    val reply_to_comment: Int,
    val attachments: Attachments,
    val sticker_id: Int,
    val guid: Int
        )