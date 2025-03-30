package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {
    Statistics statistics;

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public double[] calculateAdvStatistics(Statistics statistics) {
        double numberOfUsers = statistics.usersNames().size();
        double numberOfPosts = statistics.postCount();
        double numberOfComments = statistics.commentCount();
        double averagePostsPerUser = 0.0;
        double averageCommentsPerUser = 0.0;
        double averageCommentsPerPost = 0.0;
        if(numberOfUsers > 0) {
            averagePostsPerUser = numberOfPosts / numberOfUsers;
            averageCommentsPerUser = numberOfComments / numberOfUsers;
        }
        if (numberOfPosts > 0) {
            averageCommentsPerPost = numberOfComments / numberOfPosts;
        }
        schowStatistics(averagePostsPerUser, averageCommentsPerUser, averageCommentsPerPost);
        double[] advStatistics = {numberOfUsers, numberOfPosts, numberOfComments, averagePostsPerUser, averageCommentsPerUser, averageCommentsPerPost};
        return advStatistics;
    }

    public void schowStatistics(double averagePostsPerUser, double averageCommentsPerUser, double averageCommentsPerPost) {
        if (averagePostsPerUser > 0 && averageCommentsPerUser > 0 && averageCommentsPerPost > 0) {
            System.out.println("Average posts per user: " + averagePostsPerUser);
            System.out.println("Average comments per user: " + averageCommentsPerUser);
            System.out.println("Average comments per post: " + averageCommentsPerPost);
        }
        else if (averagePostsPerUser > 0 && averageCommentsPerUser > 0 && averageCommentsPerPost < 0) {
            System.out.println("Average posts per user: " + averagePostsPerUser);
        }
    }
}
