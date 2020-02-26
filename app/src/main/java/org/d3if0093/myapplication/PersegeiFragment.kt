package org.d3if0093.myapplication


import android.content.ActivityNotFoundException
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ShareCompat
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_persegei.*
import org.d3if0093.myapplication.databinding.FragmentPersegeiBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class PersegeiFragment : Fragment() {
private lateinit var binding: FragmentPersegeiBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_persegei, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
      butt.setOnClickListener {
       var lebar: Int = lebar.text.toString().toInt()
          var panjang: Int = panjang.text.toString().toInt()
             var luas:Int=lebar*panjang
             var kel:Int=lebar+panjang
            jawab2.text="Keliling: "+ kel.toString()
            jawabanz.text="Luas: "+luas.toString()

            }

        }

    binding.share.setOnClickListener {

            var shareIntent = ShareCompat.IntentBuilder.from(requireActivity())
                .setText("SHARE Keliling dan Luas")
                .setType("text/plain")
                .intent
            try {
                startActivity(shareIntent)
            }catch (e: ActivityNotFoundException){
                Toast.makeText(context,"Kosong !", Toast.LENGTH_SHORT).show()
            }

    }
    }
}
