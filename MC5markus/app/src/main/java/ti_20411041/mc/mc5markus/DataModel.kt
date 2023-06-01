package ti_20411041.mc.mc5markus

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataModel(
    val img: Int,
    val title : String,
    val dec: String
): Parcelable
