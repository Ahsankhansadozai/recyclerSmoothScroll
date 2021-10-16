package com.example.recyclerspeedscroller
import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerspeedscroller.databinding.RecyclerLayoutBinding
import com.example.recyclerspeedscroller.viewholder.VHSAdopter
import java.util.*

class Adopter( val context: Context,
               val arrayList: ArrayList<String>?)
    : RecyclerView.Adapter<VHSAdopter>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHSAdopter {
       return VHSAdopter(
          RecyclerLayoutBinding.inflate(
           LayoutInflater.from(parent.context),
       parent,
       false))
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: VHSAdopter, position: Int) {
        val appList: String = arrayList!!.get(position)

        holder.binding.apply {
            textView.setText(arrayList.get(position))
        }

   //     setAnimation(holder.itemView, position)

    }

    override fun getItemCount(): Int {
        return arrayList!!.size
    }
}