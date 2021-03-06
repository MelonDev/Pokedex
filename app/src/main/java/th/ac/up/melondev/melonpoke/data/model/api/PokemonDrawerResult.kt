package th.ac.up.melondev.melonpoke.data.model.api

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import java.net.URI

@Keep
data class PokemonDrawerModel(
    @SerializedName("count") var count: Int? = null,
    @SerializedName("next") var next: String? = null,
    @SerializedName("previous") var previous: String? = null,
    @SerializedName("results") var results: ArrayList<PokemonDrawerModelResult>? = null
)

@Keep
data class PokemonDrawerModelResult(
    @SerializedName("name") var name: String? = null,
    @SerializedName("url") var url: URI? = null
)

