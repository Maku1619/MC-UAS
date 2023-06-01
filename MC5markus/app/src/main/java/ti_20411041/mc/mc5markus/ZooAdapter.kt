package ti_20411041.mc.mc5markus

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ZooAdapter (private  val context : Context,
                  private  val zoos : List<DataModel>,
                  private val listener : (DataModel) -> Unit)
    : RecyclerView.Adapter<ZooAdapter.ZooHolder>() {

    class ZooHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val image = view.findViewById<ImageView>(R.id.v_img)
        private val title = view.findViewById<TextView>(R.id.v_title)


        fun bindView(zoo: DataModel, listener: (DataModel) -> Unit) {
            image.setImageResource(zoo.img)
            title.text = zoo.title
            itemView.setOnClickListener { listener(zoo) }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ZooHolder =
        ZooHolder(LayoutInflater.from(context).inflate(R.layout.item_list, parent, false))

    override fun getItemCount(): Int = zoos.size

    override fun onBindViewHolder(holder: ZooHolder, position: Int) {
        holder.bindView(zoos[position], listener)
    }
}