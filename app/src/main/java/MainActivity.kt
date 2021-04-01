import android.R
import android.graphics.Insets.add
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var no1: EditText? = null
    var no2: EditText? = null
    var add: Button? = null
    var mul: Button? = null
    var div: Button? = null
    var sub: Button? = null
    var equal: Button? = null
    var answer: TextView? = null
    var ans = 0.0 // global variable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_item)

        // for text views
        no1 = findViewById(R.id.first_no)
        no2 = findViewById(R.id.second_no)

        // for button with operations
        add = findViewById(R.id.add)
        mul = findViewById(R.id.mul)
        div = findViewById(R.id.div)
        sub = findViewById(R.id.sub)

        // for equal to button
        equal = findViewById(R.id.equals)

        // for answer field
        answer = findViewById(R.id.answer)
    }
}
class MainActivity : AppCompatActivity() {
    var no1: EditText? = null
    var no2: EditText? = null
    var add: Button? = null
    var mul: Button? = null
    var div: Button? = null
    var sub: Button? = null
    var equal: Button? = null
    var answer: TextView? = null
    var ans = 0.0 // global variable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // for text views
        no1 = findViewById(R.id.first_no)
        no2 = findViewById(R.id.second_no)

        // for button with operations
        add = findViewById(R.id.add)
        mul = findViewById(R.id.mul)
        div = findViewById(R.id.div)
        sub = findViewById(R.id.sub)

        // for equal to button
        equal = findViewById(R.id.equals)

        // for answer field
        answer = findViewById(R.id.answer)
    }
}