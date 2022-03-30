import classFieldsPost.*
import classFieldsPost.attachments.Attachments

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Int,
    val comments: Comments,
    val copyright: String,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val post_type: String,
    val post_source: PostSource?,
    val attachments: Array<Attachments>,
    val geo: Geo?,
    val signerId: Int,
    val copy_history: Array<Reposts>,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Int,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val postponedId: Int
)

object WallServices {
    private var posts = emptyArray<Post>()
    private var idIndividual = 1

    fun add(post: Post): Post {
        posts += post.copy(id = idIndividual)
        idIndividual++
        posts += post
        return post
    }

    fun update(post: Post): Boolean {
        for (i in posts.indices) {
            if (post.id == posts[i].id) {
                posts[i] = post.copy(id = posts[i].id, date = posts[i].date)
                return true
            }
        }
        return false
    }
}