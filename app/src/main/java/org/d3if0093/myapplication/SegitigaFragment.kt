package org.d3if0093.myapplication


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_segitiga.*
import org.d3if0093.myapplication.databinding.FragmentSegitigaBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SegitigaFragment : Fragment() {
private lateinit var binding:FragmentSegitigaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_segitiga, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            butt.setOnClickListener {
                var alas1: Int = alas.text.toString().toInt()
                var tinggi1: Int = tinggi.text.toString().toInt()
                var pitagoras:Double=Math.sqrt(Math.pow(alas.text.toString().toDouble(),2.0)+Math.pow(tinggi.text.toString().toDouble(),2.0))
                var luas: Int = alas1 * tinggi1 / 2
                var kel:Double=alas1.toDouble()+tinggi1.toDouble()+pitagoras
                jawabanz.text = "Luas: "+luas.toString()
                jawab2.text="Keliling: "+kel.toString()
            }

        }
    }


}
