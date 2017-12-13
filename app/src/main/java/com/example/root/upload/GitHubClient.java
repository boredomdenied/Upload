package com.example.root.upload;
import com.example.root.upload.GitHubRepo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by root on 12/13/17.
 */


public interface GitHubClient {

   @GET("/users/{user}/repos")
   Call<List<GitHubRepo>> reposForUser(@Path("user") String user);
}
