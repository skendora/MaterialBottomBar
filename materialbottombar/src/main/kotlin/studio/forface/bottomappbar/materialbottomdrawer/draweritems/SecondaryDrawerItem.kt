package studio.forface.bottomappbar.materialbottomdrawer.draweritems

import studio.forface.bottomappbar.materialbottomdrawer.holders.ColorHolder
import studio.forface.bottomappbar.materialbottomdrawer.holders.IconSizeHolder
import studio.forface.bottomappbar.materialbottomdrawer.holders.TextSizeHolder

class SecondaryDrawerItem: BaseDrawerItem() {
    override val thisRef get() = this
    override val iconMarginStartDp = 48f
    override val iconMarginEndDp = 12f
    override val iconAlpha = 0.5f

    override var titleTextSizeHolder =  TextSizeHolder( sp = 16f )

    override var iconColorHolder =      ColorHolder()
    override var iconSizeHolder =       IconSizeHolder( dp = 24f )
}