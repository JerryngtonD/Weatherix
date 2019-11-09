package otus.android.forecast.data.response

import com.google.gson.annotations.SerializedName

data class CurrentWeatherEntry(
    @SerializedName("observation_time")
    val observationTime: String,

    @SerializedName("temperature")
    val temperature: Int,

    @SerializedName("weather_code")
    val weather_code: Int,

    @SerializedName("weather_icons")
    val weather_icons: List<String>,

    @SerializedName("weather_descriptions")
    val weatherDescriptions: List<String>,

    @SerializedName("wind_speed")
    val windSpeed: Int,

    @SerializedName("wind_degree")
    val wind_degree: Int,

    @SerializedName("wind_dir")
    val windDir: String,

    @SerializedName("pressure")
    val pressure: Int,

    @SerializedName("precip")
    val precip: Int,

    @SerializedName("humidity")
    val humidity: Int,

    @SerializedName("cloudcover")
    val cloudCover: Int,

    @SerializedName("feelslike")
    val feelsLike: Int,

    @SerializedName("uv_index")
    val uvIndex: Int,

    @SerializedName("visibility")
    val visibility: Int,

    @SerializedName("is_day")
    val isDay: String
)