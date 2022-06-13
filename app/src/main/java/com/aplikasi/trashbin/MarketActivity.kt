package com.aplikasi.trashbin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.aplikasi.trashbin.adapter.ProdukAdapter
import com.aplikasi.trashbin.adapter.SliderAdapter
import com.aplikasi.trashbin.databinding.ActivityMarketBinding
import com.aplikasi.trashbin.model.ModelProduk

class MarketActivity : Fragment() {

    private var binding : ActivityMarketBinding? = null
    lateinit var vpSlider : ViewPager
    lateinit var rvBaju : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.activity_market, container, false)

        //<-- Slider -->
        vpSlider = view.findViewById(R.id.vp_slider)

        val arraySlider = ArrayList<Int>()

        arraySlider.add(R.drawable.slide1)
        arraySlider.add(R.drawable.slide2)
        arraySlider.add(R.drawable.slide3)

        val sliderAdapter = SliderAdapter(arraySlider, activity)
        vpSlider.adapter = sliderAdapter

        //<-- RecyclerView Apparel -->
        val lm = LinearLayoutManager(activity)
        lm.orientation = LinearLayoutManager.HORIZONTAL
        rvBaju = view.findViewById(R.id.rv_baju)

        val adapterBaju = ProdukAdapter(ArrayBaju,activity)
        rvBaju.setHasFixedSize(true)
        rvBaju.layoutManager = lm
        rvBaju.adapter = adapterBaju

        return view
    }

    val ArrayBaju : ArrayList<ModelProduk>get(){

        val arraybarang = ArrayList<ModelProduk>()

        //1
        val produk1 = ModelProduk()
        produk1.namaProduk = "Rinso Detergent 460gr"
        produk1.hargaProduk = "18.000 point"
        produk1.gambarProduk = R.drawable.rinso

        //2
        val produk2 = ModelProduk()
        produk2.namaProduk = "Hemart 1 Liter"
        produk2.hargaProduk = "22.000"
        produk2.gambarProduk = R.drawable.hemart

        //3
        val produk3 = ModelProduk()
        produk3.namaProduk = "Gulaku 1 kg"
        produk3.hargaProduk = "14.000"
        produk3.gambarProduk = R.drawable.gulaku

        //4
        val produk4 = ModelProduk()
        produk4.namaProduk = "Kecap Bango sachet"
        produk4.hargaProduk = "2.000"
        produk4.gambarProduk = R.drawable.kecap

        //5
        val produk5 = ModelProduk()
        produk5.namaProduk = "Sabun LifeBuoy 70gr"
        produk5.hargaProduk = "2.500"
        produk5.gambarProduk = R.drawable.sabun

        //6
        val produk6 = ModelProduk()
        produk6.namaProduk = "Sunlight"
        produk6.hargaProduk = "5.000"
        produk6.gambarProduk = R.drawable.sunlight

        arraybarang.add(produk1)
        arraybarang.add(produk2)
        arraybarang.add(produk3)
        arraybarang.add(produk4)
        arraybarang.add(produk5)
        arraybarang.add(produk6)

        return arraybarang
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}