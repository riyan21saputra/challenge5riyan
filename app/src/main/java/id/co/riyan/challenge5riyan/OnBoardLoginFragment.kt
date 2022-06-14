package id.co.riyan.challenge5riyan

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment

class OnBoardLoginFragment : Fragment() {

    lateinit var etName : EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_on_board_login1, container, false)

        etName = view.findViewById(R.id.et_name)

        etName.addTextChangedListener {
            listener?.afterUserInputName(it.toString())
        }


        return view
    }

    var listener: UserNameInputListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is UserNameInputListener) {
            listener = context
        }
    }

    interface UserNameInputListener {



        fun afterUserInputName(input: String)
    }

}