package com.muhammadsayed.yassirmovieapp.testdoubles

import com.muhammadsayed.common.Response
import com.muhammadsayed.moviedetails.data.mappers.toMovieDetailUi
import com.muhammadsayed.moviedetails.domain.model.MovieDetailsUiModel
import com.muhammadsayed.moviedetails.domain.repository.MovieDetailsRepository
import com.muhammadsayed.yassirmovieapp.movieDetail
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class FakeMovieDetailsRepository : MovieDetailsRepository {
    override suspend fun getMovieDetailsById(movieId: Int): Flow<Response<MovieDetailsUiModel>> {
        return flowOf(Response.Success(movieDetail.toMovieDetailUi()))
    }
}