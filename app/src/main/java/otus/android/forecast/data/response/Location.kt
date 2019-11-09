package otus.android.forecast.data.response

import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("name")
    val name: String,

    @SerializedName("country")
    val country: String,

    @SerializedName("region")
    val region: String,

    @SerializedName("lat")
    val lat: Double,

    @SerializedName("lon")
    val lon: Double,

    @SerializedName("timezone_id")
    val timezoneId: String,

    @SerializedName("localtime")
    val localtime: String,

    @SerializedName("localtime_epoch")
    val localtimeEpoch: Long,

    @SerializedName("utc_offset")
    val utcOffset: Double
)