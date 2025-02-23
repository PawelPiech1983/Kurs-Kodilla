package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Forum Tests Suite ")
public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of the tests");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("This is the end of the tests");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("This is the test #" + testCounter);
    }

    @Nested
    @DisplayName("TDD: Tests for posts ")
    class TestPosts {
        @Test
        void testAddPost() {
            //Given
            ForumUser forumUser = new ForumUser("ForumTest", "Pawel Piech");
            //When
            forumUser.addPost("ForumTest", "Hello World! This is a test of my first Post");
            //Then
            Assertions.assertEquals(1, forumUser.getPostsQuantity());
        }

        @Test
        void testGetPost() {
            //Given
            ForumUser forumUser = new ForumUser("ForumTest", "Pawel Piech");
            ForumPost thePost = new ForumPost("Hello World! This is my post", "ForumTest");
            forumUser.addPost(thePost.getPostBody(), thePost.getAuthor());

            //When
            ForumPost retrievedPost;
            retrievedPost = forumUser.getPost(0);

            //Then
            Assertions.assertEquals(thePost, retrievedPost);
        }

        @Test
        void testRemovePostNotExisting() {
            //Given
            ForumUser forumUser = new ForumUser("ForumTest", "Pawel Piech");
            ForumPost thePost = new ForumPost("Hello World! This is my post", "ForumTest");

            //When
            boolean result = forumUser.removePost(thePost);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testRemovePost() {
            //Given
            ForumUser forumUser = new ForumUser("ForumTest", "Pawel Piech");
            ForumPost thePost = new ForumPost("Hello World!", "ForumTest");
            forumUser.addPost(thePost.getPostBody(), thePost.getAuthor());

            //When
            boolean result = forumUser.removePost(thePost);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, forumUser.getPostsQuantity());
        }
    }
    @Nested
    @DisplayName("TDD: Tests for comments ")
    class TestComments {
        @Test
        void testAddComment() {
            //Given
            ForumUser forumUser = new ForumUser("ForumTest", "Pawel Piech");
            ForumPost thePost = new ForumPost("Hello World! This is my post", "ForumTest");
            //When
            forumUser.addComment(thePost, "ForumUser", "Hello World! This is a test of my first comment");
            //Then
            Assertions.assertEquals(1, forumUser.getCommentsQuantity() );
        }

        @Test
        void testGetComment() {
            //Given
            ForumUser forumUser = new ForumUser("ForumTest", "Pawel Piech");
            ForumPost thePost = new ForumPost("Hello World! This is my post", "ForumTest");
            ForumComment theComment = new ForumComment(thePost, "My comment to first Post", "ForumTest");
            forumUser.addComment(thePost, theComment.getCommentBody(), theComment.getAuthor());

            //When
            ForumComment retrievedComment = forumUser.getComment(0);

            //then
            Assertions.assertEquals(theComment, retrievedComment);
        }

        @Test
        void testRemoveCommentNotExisting() {
            //Given
            ForumUser forumUser = new ForumUser("ForumTest", "Pawel Piech");
            ForumPost thePost = new ForumPost("Hello World! This is my post", "ForumTest");
            ForumComment theComment = new ForumComment(thePost, "My comment to first Post", "ForumTest");

            //When
            boolean result = forumUser.removeComment(theComment);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testRemoveComment() {
            //Given
            ForumUser forumUser = new ForumUser("ForumTest", "Pawel Piech");
            ForumPost thePost = new ForumPost("Hello World! This is my post", "ForumTest");
            ForumComment theComment = new ForumComment(thePost, "My comment to first Post", "ForumTest");
            forumUser.addComment(thePost, theComment.getCommentBody(), theComment.getAuthor());

            //When
            boolean result = forumUser.removeComment(theComment);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, forumUser.getCommentsQuantity());
        }
    }

}

