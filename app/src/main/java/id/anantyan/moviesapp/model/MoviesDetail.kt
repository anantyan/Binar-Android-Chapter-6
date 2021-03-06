package id.anantyan.moviesapp.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import id.anantyan.utils.Constant.BASE_IMAGE
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MoviesDetail(

	@SerializedName("status_message")
	val statusMessage: String? = null,

	@SerializedName("status_code")
	val statusCode: Int? = null,

	@SerializedName("success")
	val success: Boolean? = null,

	@SerializedName("original_language")
	val originalLanguage: String? = null,

	@SerializedName("imdb_id")
	val imdbId: String? = null,

	@SerializedName("video")
	val video: Boolean? = null,

	@SerializedName("title")
	val title: String? = null,

	@SerializedName("backdrop_path")
	val _backdropPath: String? = null,

	@SerializedName("revenue")
	val revenue: Int? = null,

	@SerializedName("genres")
	val genres: List<GenresItem>? = null,

	@SerializedName("popularity")
	val popularity: Double? = null,

	@SerializedName("production_countries")
	val productionCountries: List<ProductionCountriesItem>? = null,

	@SerializedName("id")
	val id: Int? = null,

	@SerializedName("vote_count")
	val voteCount: Int? = null,

	@SerializedName("budget")
	val budget: Int? = null,

	@SerializedName("overview")
	val overview: String? = null,

	@SerializedName("original_title")
	val originalTitle: String? = null,

	@SerializedName("runtime")
	val runtime: Int? = null,

	@SerializedName("poster_path")
	val _posterPath: String? = null,

	@SerializedName("spoken_languages")
	val spokenLanguages: List<SpokenLanguagesItem>? = null,

	@SerializedName("production_companies")
	val productionCompanies: List<ProductionCompaniesItem>? = null,

	@SerializedName("release_date")
	val releaseDate: String? = null,

	@SerializedName("vote_average")
	val voteAverage: Double? = null,

	@SerializedName("belongs_to_collection")
	val belongsToCollection: BelongsToCollection? = null,

	@SerializedName("tagline")
	val tagline: String? = null,

	@SerializedName("adult")
	val adult: Boolean? = null,

	@SerializedName("homepage")
	val homepage: String? = null,

	@SerializedName("status")
	val status: String? = null
) : Parcelable {
	val backdropPath get() = "${BASE_IMAGE}${_backdropPath}"
	val posterPath get() = "${BASE_IMAGE}${_posterPath}"
}

@Parcelize
data class GenresItem(

	@SerializedName("name")
	val name: String? = null,

	@SerializedName("id")
	val id: Int? = null
) : Parcelable

@Parcelize
data class ProductionCountriesItem(

	@SerializedName("iso_3166_1")
	val iso31661: String? = null,

	@SerializedName("name")
	val name: String? = null
) : Parcelable

@Parcelize
data class SpokenLanguagesItem(

	@SerializedName("name")
	val name: String? = null,

	@SerializedName("iso_639_1")
	val iso6391: String? = null,

	@SerializedName("english_name")
	val englishName: String? = null
) : Parcelable

@Parcelize
data class BelongsToCollection(

	@SerializedName("backdrop_path")
	val _backdropPath: String? = null,

	@SerializedName("name")
	val name: String? = null,

	@SerializedName("id")
	val id: Int? = null,

	@SerializedName("poster_path")
	val _posterPath: String? = null
) : Parcelable {
	val backdropPath get() = "${BASE_IMAGE}${_backdropPath}"
	val posterPath get() = "${BASE_IMAGE}${_posterPath}"
}

@Parcelize
data class ProductionCompaniesItem(

	@SerializedName("logo_path")
	val _logoPath: String? = null,

	@SerializedName("name")
	val name: String? = null,

	@SerializedName("id")
	val id: Int? = null,

	@SerializedName("origin_country")
	val originCountry: String? = null
) : Parcelable {
	val logoPath get() = "${BASE_IMAGE}${_logoPath}"
}
