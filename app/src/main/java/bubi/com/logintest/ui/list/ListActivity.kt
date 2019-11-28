package bubi.com.logintest.ui.list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import bubi.com.logintest.R
import bubi.com.logintest.data.CustomData
import kotlinx.android.synthetic.main.activity_list.*
import org.jetbrains.annotations.NotNull

class ListActivity : AppCompatActivity() {

    companion object {
        const val MAX_ITEMS = 20
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_list)

        setup(recycler_view)
    }

    private fun setup(@NotNull recyclerView: RecyclerView) {
        recyclerView.adapter = CustomAdapter()
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        with(recyclerView.adapter as CustomAdapter) {
            setItems(generateDummyData())
        }
//        recyclerView.addOnItemTouchListener(CustomRecyclerViewItemTouchListener(recyclerView,
//                intArrayOf(R.id.backup_view, R.id.block_view),
//                object : CustomRecyclerViewItemTouchListener.MyCustomClickListener {
//                    override fun onBackupClick(view: View, position: Int) {
//                        Toast.makeText(view.context, "Backup action on position = $position", Toast.LENGTH_LONG).show()
//                    }
//
//                    override fun onBlockClick(view: View, position: Int) {
//                        Toast.makeText(view.context, "Block action on position = $position", Toast.LENGTH_LONG).show()
//                    }
//
//                    override fun onClick(view: View, position: Int) {
//                        Toast.makeText(view.context, "Single click action on position = $position", Toast.LENGTH_LONG).show()
//                    }
//
//                    override fun onLongClick(view: View, position: Int) {
//                        Toast.makeText(view.context, "Long click action on position = $position", Toast.LENGTH_LONG).show()
//                        openCardViewScreen()
//                    }
//                })
//        )
    }

    private fun openCardViewScreen() {
//        startActivity(Intent(this, CardViewActivity::class.java))
    }

    @NotNull
    private fun generateDummyData(): ArrayList<CustomData> =
            (0..MAX_ITEMS).mapTo(ArrayList(MAX_ITEMS)) {
                CustomData(it ,
                        String.format(resources.getString(R.string.title_pattern), it),
                        String.format(resources.getString(R.string.description_pattern), it))
            }
}