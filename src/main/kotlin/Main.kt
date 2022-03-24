import classFieldsPost.*

class Main {
}fun main() {
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
    val comment1 = Comments(
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
        comments = comment1,
        copyright = "Netology.ru",
        likes = likes1,
        reposts = reposts1,
        views = views1,
        post_type = "Post",
        post_source = postSource1,
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
        comments = comment1,
        copyright = "Netology.ru",
        likes = likes1,
        reposts = reposts1,
        views = views1,
        post_type = "Post",
        post_source = postSource1,
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
        comments = comment1,
        copyright = "Netology.ru",
        likes = likes1,
        reposts = reposts1,
        views = views1,
        post_type = "Post",
        post_source = postSource1,
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
}