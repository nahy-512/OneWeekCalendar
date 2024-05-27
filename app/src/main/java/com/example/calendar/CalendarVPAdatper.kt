package com.example.calendar

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import java.time.LocalDate

class CalendarVPAdatper(
    fragmentActivity: FragmentActivity,
    private val onClickListener: IDateClickListener,
): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = Int.MAX_VALUE

    override fun createFragment(position: Int): Fragment {
        return CalendarOneWeekFragment.newInstance(position, onClickListener)
    }
}