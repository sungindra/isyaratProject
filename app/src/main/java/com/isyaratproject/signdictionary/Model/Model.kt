package com.isyaratproject.signdictionary.Model


class ImageSign(val ImageID: Int, val ImageURL: String, val ImageTitle: String, val CategoryName: String, val Username: String, val ImageDate: String)

class Post(val PostID: Int, val PostTitle: String, val CategoryName: String, val Username: String, val PostDate: String, val PostPoint: Int)

class Comment(val CommentID: Int, val PostID: Int, val ImageID: Int, val CommentPoint: Int, val Verifired: Boolean)