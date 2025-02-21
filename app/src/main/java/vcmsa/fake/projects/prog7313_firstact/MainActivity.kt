package vcmsa.fake.projects.prog7313_firstact

import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var etValOne: EditText? = null
    var etValTwo: EditText? = null
    var btnCalculate: Button? = null
    var tvResult: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etValOne = findViewById<EditText>(R.id.etValOne)
        etValTwo = findViewById<EditText>(R.id.etValTwo)
        btnCalculate = findViewById<Button>(R.id.btnCalculate)
        tvResult = findViewById<TextView>(R.id.tvResult)

        btnCalculate.setOnClickListener(View.OnClickListener {
            val val1 = etValOne.getText().toString()
            val val2 = etValTwo.getText().toString()
            if (!val1.isEmpty() && !val2.isEmpty()) {
                val num1 = val1.toDouble()
                val num2 = val2.toDouble()
                val sum = num1 + num2

                tvResult.setText("Result: $sum")
            } else {
                tvResult.setText("Please enter both numbers")
            }
        })
    }
}