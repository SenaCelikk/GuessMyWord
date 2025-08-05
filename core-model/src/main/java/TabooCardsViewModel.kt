import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@HiltViewModel
class TabooCardsViewModel : ViewModel() {


    private val _tabooCards = MutableStateFlow<List<TabooCard>>(emptyList())
    val tabooCards: StateFlow<List<TabooCard>> = _tabooCards

    fun fetchTabooCards() {

    }
}
