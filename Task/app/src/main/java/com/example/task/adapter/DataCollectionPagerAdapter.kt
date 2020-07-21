package com.example.task.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.task.R

class DataCollectionPagerAdapter(val layoutSize: Int) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val PERSONAL_VIEW = 0
        const val ADDRESS_VIEW = 1
        const val BUSSINESS_VIEW = 2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView: View
        return when (viewType) {
            PERSONAL_VIEW -> {
                val itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.personal_info, parent, false)
                PersonalInfoViewHolder(itemView)
            }
            ADDRESS_VIEW -> {
                itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.address_info, parent, false)
                AddressInfoViewHolder(itemView)
            }
            else -> {
                itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.bussiness_info, parent, false)
                BussinessInfoViewHolder(itemView)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is PersonalInfoViewHolder -> holder.bindView(position)
            is AddressInfoViewHolder -> holder.bindView(position)
            is BussinessInfoViewHolder -> holder.bindView(position)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (position) {
            0 -> PERSONAL_VIEW
            1 -> ADDRESS_VIEW
            else -> BUSSINESS_VIEW
        }
    }

    override fun getItemCount(): Int {
        return layoutSize
    }

    internal class PersonalInfoViewHolder(itemView: View?) :
        RecyclerView.ViewHolder(itemView!!) {
        fun bindView(position: Int) {
            //val book: Book = mLiteratureList.get(position) as Book
            // bind data to the views
            // textView.setText()...
        }
    }

    internal class AddressInfoViewHolder(itemView: View?) :
        RecyclerView.ViewHolder(itemView!!) {
        fun bindView(position: Int) {
            // val magazine: Magazine = mLiteratureList.get(position) as Magazine
            // bind data to the views
        }
    }

    internal class BussinessInfoViewHolder(itemView: View?) :
        RecyclerView.ViewHolder(itemView!!) {
        fun bindView(position: Int) {
            //val newspaper: Newspaper = mLiteratureList.get(position) as Newspaper
            // bind data to the views
        }
    }
}