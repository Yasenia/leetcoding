package leetcoding.algorithms.problem0690

class Solution1 : Solution {

    override fun getImportance(employees: List<Employee?>, id: Int): Int = getImportance(employees.associateBy { it!!.id }, id)

    private fun getImportance(employees: Map<Int, Employee?>, id: Int): Int {
        val employee = employees[id] ?: return 0
        return employee.importance + employee.subordinates.sumOf { getImportance(employees, it) }
    }
}
