import classFieldsPost.*
import classFieldsPost.attachments.*

class Main {
}

fun main() {
    val link = Link(
        id = 1,
        userId = 1
    )
    val linksAttachments = LinksAttachments(
        links = link
    )
    val comment1 = Comment (
        owner_id = 12,
        post_id = 1,
        from_group = 123,
        message = "Coment first",
        reply_to_comment = 12,
        attachments = linksAttachments,
        sticker_id = 43,
        guid = 23
    )
    val comment2 = Comment (
        owner_id = 12,
        post_id = 34,
        from_group = 123,
        message = "Coment first",
        reply_to_comment = 12,
        attachments = linksAttachments,
        sticker_id = 43,
        guid = 23
    )

    val audio = Audio(
        id = 1,
        albun = 1
    )
    val audioAttachments = AudioAttachments(
        audio = audio
    )
    val postSource1 = PostSource(
        type = "vk",
        platform = "android",
        data = "profile_activity",
        url = "www.vk.ru"
    )
    val copyHistory1 = emptyArray<Reposts>()
    val geo1 = Geo(
        type = "Moscow",
        coordinates = "11.32",
        place = null
    )
    val views1 = Views(
        count = 543
    )
    val reposts1 = Reposts(
        count = 54,
        userReposted = true
    )
    val likes1 = Likes(
        count = 12,
        userLikes = true,
        canLike = false,
        canPublish = false
    )
    val comments1 = Comments(
        count = 15,
        canPost = true,
        groupsCanPost = true,
        canClose = true,
        canOpen = false
    )
    val original = Post(
        id = 1,
        ownerId = 1,
        fromId = 21,
        createdBy = 22,
        date = 12,
        text = "Hello",
        replyOwnerId = 654,
        replyPostId = 980,
        friendsOnly = 98,
        comments = comments1,
        copyright = "Netology.ru",
        likes = likes1,
        reposts = reposts1,
        views = views1,
        post_type = "Post",
        post_source = postSource1,
        attachments = addAttachments(audioAttachments),
        geo = geo1,
        signerId = 43,
        copy_history = copyHistory1,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = 1,
        markedAsAds = false,
        isFavorite = true,
        postponedId = 0
    )
    val original1 = Post(
        id = 2,
        ownerId = 11,
        fromId = 21,
        createdBy = 222,
        date = 12,
        text = "Helloooo",
        replyOwnerId = 654,
        replyPostId = 980,
        friendsOnly = 98,
        comments = comments1,
        copyright = "Netology.ru",
        likes = likes1,
        reposts = reposts1,
        views = views1,
        post_type = "Post",
        post_source = postSource1,
        attachments = addAttachments(audioAttachments),
        geo = geo1,
        signerId = 43,
        copy_history = copyHistory1,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = 1,
        markedAsAds = false,
        isFavorite = true,
        postponedId = 0
    )
    val original2 = Post(
        id = 1,
        ownerId = 1,
        fromId = 21,
        createdBy = 22,
        date = 123,
        text = "UPDATE Hello",
        replyOwnerId = 654,
        replyPostId = 980,
        friendsOnly = 98,
        comments = comments1,
        copyright = "Netology.ru",
        likes = likes1,
        reposts = reposts1,
        views = views1,
        post_type = "Post",
        post_source = postSource1,
        attachments = addAttachments(linksAttachments),
        geo = geo1,
        signerId = 43,
        copy_history = copyHistory1,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = 1,
        markedAsAds = false,
        isFavorite = true,
        postponedId = 0
    )

    println(WallServices.add(original))
    println(WallServices.add(original1))
    println(WallServices.update(original2))
    println(WallServices.createComment(comment2))
}