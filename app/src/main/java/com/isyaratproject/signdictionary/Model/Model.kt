package com.isyaratproject.signdictionary.Model

class User(val UserID: Int, val Username: String, val Email: String, val Password: String)

class Category(val CategoryID: Int, val CategoryName: String)

class ImageSign(val ImageID: Int, val ImageURL: String, val ImageTitle: String, val CategoryID: Int, val UserID: Int, val ImageDate: String)

class Dictionary(val CategoryID: Int, val ImageID: Int)

class Post(val PostID: Int, val PostTitle: String, val CategoryID: Int, val UserID: Int, val PostDate: String, val PostPoint: Int)

class Comment(val CommentID: Int, val PostID: Int, val ImageID: Int, val CommentPoint: Int, val Verifired: Boolean)