package th.ac.up.melondev.melonpoke.ui.detail.viewholder

import android.os.Parcelable
import android.util.Log
import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import kotlinx.android.synthetic.main.detail_type_card.view.*
import th.ac.up.melondev.melonpoke.data.model.local.PokemonTypeModel
import th.ac.up.melondev.melonpoke.ui.main.base.BaseViewHolder
import th.ac.up.melondev.melonpoke.utill.PokemonTypeListener
import th.ac.up.melondev.melonpoke.utill.TypeDetailDialog

class DetailTypeCardViewHolder(itemView: View,private val listener: PokemonTypeListener?) : BaseViewHolder<Parcelable>(itemView) {
    private val textview = itemView.detail_type_text_view
    private val imageview = itemView.detail_type_image_view

    fun bind(data: PokemonTypeModel) {
        Glide.with(itemView.context)
            .load(data.image)
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(imageview)

        textview.text = data.name?.capitalize()

        itemView.setOnClickListener {
            listener?.onClick(data)
        }
    }



}