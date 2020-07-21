package com.example.task.ui.signup

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.example.task.R
import com.example.task.adapter.DataCollectionPagerAdapter
import com.example.task.databinding.ActivityDataCollectionBinding
import com.example.task.ui.UserViewModel
import com.example.task.utils.isValidPhone
import org.koin.android.viewmodel.ext.android.viewModel

class DataCollectionActivity : AppCompatActivity() {
    private val userViewModel by viewModel<UserViewModel>()

    private var mAdapter: DataCollectionPagerAdapter? = null
    private lateinit var dots: List<TextView>
    private var layoutSize: Int = 3
    private lateinit var binding: ActivityDataCollectionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataCollectionBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        init()
        observables()
    }

    private fun observables() {
        userViewModel.name.observe(this, Observer {

        })
        userViewModel.phone.observe(this, Observer {
            if (!isValidPhone(it)) {
                Toast.makeText(this, "please enter valid mobile number", Toast.LENGTH_SHORT).show()
            }
        })
        userViewModel.age.observe(this, Observer {

        })
        userViewModel.gender.observe(this, Observer {

        })
        userViewModel.town.observe(this, Observer {

        })
        userViewModel.state.observe(this, Observer {

        })
        userViewModel.pin.observe(this, Observer {

        })
        userViewModel.bussiness.observe(this, Observer {

        })
        userViewModel.bussiness_type.observe(this, Observer {

        })
        userViewModel.bussiness_location.observe(this, Observer {

        })
        userViewModel.bussiness_mail.observe(this, Observer {

        })
    }

    private fun init() {
        mAdapter = DataCollectionPagerAdapter(layoutSize)
        binding.viewPager.setAdapter(mAdapter)
        binding.viewPager.registerOnPageChangeCallback(pageChangeCallback)
        // binding.btnSkip.setOnClickListener({ v -> launchHomeScreen() })
        binding.btnNext.setOnClickListener { v ->
            val current = getItem(+1)
            if (current < layoutSize) {
                binding.viewPager.setCurrentItem(current)
            } else {
                finish()
            }
        }
        binding.btnSkip.setOnClickListener { v ->
            val current = getItem(-1)
            if (current > -1) {
                binding.viewPager.setCurrentItem(current)
            } else {
                finish()
            }
        }
    }

    private fun getItem(i: Int): Int {
        return binding.viewPager.getCurrentItem() + i
    }

    var pageChangeCallback: OnPageChangeCallback = object : OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)
            if (position == layoutSize - 1) {
                binding.btnNext.text = getString(R.string.submit)
            } else {
                binding.btnNext.text = getString(R.string.next)
                binding.btnSkip.visibility = View.VISIBLE
            }

            if (position != 0) {
                binding.btnSkip.text = getString(R.string.previous)
            } else {
                binding.btnSkip.text = getString(R.string.skip)
            }
        }
    }

}