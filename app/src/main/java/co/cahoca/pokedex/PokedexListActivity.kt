package co.cahoca.pokedex

import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import java.io.IOException

const val TAG: String = "PokedexListActivity"

class PokedexListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokedex_list)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.setHasFixedSize(true)
    }

    companion object{
        fun getAssetsDrawable(context: Context, fileName:String): BitmapDrawable?{
            var bitmap: BitmapDrawable? = null
            return bitmap
        }
    }
}