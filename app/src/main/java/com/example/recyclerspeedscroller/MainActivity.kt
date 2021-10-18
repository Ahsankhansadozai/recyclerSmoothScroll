package com.example.recyclerspeedscroller
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.DisplayMetrics
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSmoothScroller
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerspeedscroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mBinding: ActivityMainBinding
    var arrayList: ArrayList<String>? = null
    private var appListAdopter: Adopter? = null
    private var SPEED  = 0// Change this value (default=25f)
    var speedScroll = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        initComponents()

        //init view model
        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.observeCount().observe(this , {
            speedScroll = it
            SPEED = it
        })

        mBinding.ivmin.setOnClickListener {
            //increasing the speed
            viewModel.incSpeed()
            appListAdopter?.notifyDataSetChanged()
        }

        mBinding.ivplus.setOnClickListener {
            //decreasing the speed
            viewModel.disSpeed()
            appListAdopter?.notifyDataSetChanged()
        }

        viewModel.observeCount().observe(this, {
            speedScroll = it
            SPEED = it
            Log.d("ahsan" , it.toString())

            appListAdopter?.notifyDataSetChanged()

        })

        mSetAdopter()
    }

    private fun mSetAdopter() {
        /* appListAdopter = Adopter(this, arrayList)
         mBinding.mainRecyler.setLayoutManager(LinearLayoutManager(this))
         mBinding.mainRecyler.setAdapter(appListAdopter)
         mBinding.mainRecyler.isNestedScrollingEnabled = false
         mBinding.mainRecyler.setHasFixedSize(true)*/

        setUpRecyclerView()

    }

    private fun initComponents() {
        arrayList = ArrayList()
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")
        arrayList?.add("Ahsan")

    }

    private fun autoScroll() {
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed(object : Runnable {
            var count = 0
            override fun run() {
                if (count == mBinding.mainRecyler.getAdapter()?.getItemCount() ?: true) count = 0
                if (count <= mBinding.mainRecyler.getAdapter()!!.getItemCount()) {
                    mBinding.mainRecyler.smoothScrollToPosition(++count)
                    handler.postDelayed(this, speedScroll.toLong())
                }
            }
        }, speedScroll.toLong())
    }

    private fun setUpRecyclerView() {
        val layoutManager = object : LinearLayoutManager(this) {
            override fun smoothScrollToPosition(
                recyclerView: RecyclerView,
                state: RecyclerView.State,
                position: Int
            ) {
                val smoothScroller: LinearSmoothScroller =
                    object : LinearSmoothScroller(baseContext) {

                        override fun calculateSpeedPerPixel(displayMetrics: DisplayMetrics): Float {
                            Log.d("ahsan","speed us $SPEED")
                            return SPEED.toFloat() / displayMetrics.densityDpi
                        }
                    }
                smoothScroller.targetPosition = recyclerView.adapter!!.itemCount
                //smoothScroller.setTargetPosition(position); //This Will Scroll Recyclerview From Top to Bottom And Automatically Bottom To top
                startSmoothScroll(smoothScroller)
            }
        }
        autoScroll()
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL)
        mBinding.mainRecyler.setLayoutManager(layoutManager)
        mBinding.mainRecyler.setAdapter(Adopter(this, arrayList))
    }
}