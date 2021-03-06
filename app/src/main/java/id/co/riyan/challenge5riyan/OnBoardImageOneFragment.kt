package id.co.riyan.challenge5riyan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import java.util.zip.Inflater


class OnBoardImageOneFragment : Fragment(), MainActivity.OnSendDataToFragment {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // step 5 kirim data dari activity ke fragment, isi variable listener di activity
        (activity as MainActivity).listener = this

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_on_board_image, container, false)
    }

    // step 4 kirim data dari activity ke fragment, override fungsi pada interface
    override fun onDataSend(input: String) {
        Toast.makeText(requireContext(), "data : $input", Toast.LENGTH_SHORT).show()
    }

}