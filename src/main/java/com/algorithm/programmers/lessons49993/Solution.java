package com.algorithm.programmers.lessons49993;

/**
 * 스킬트리
 */
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (int i = 0; i < skill_trees.length; i++) {
            boolean isPossible = checkSkillTree(skill, skill_trees[i]);
            if (isPossible) {
                answer++;
            }
        }
        return answer;
    }

    private boolean checkSkillTree(String skill, String skillTree) {
        StringBuilder sb = new StringBuilder();
        String[] skillTreeArr = skillTree.split("");
        for (String s : skillTreeArr) {
            if (skill.contains(s)) {
                sb.append(s);
            }
        }

        String learnedSkill = skill.substring(0, sb.length());
        return learnedSkill.equals(sb.toString());
    }

    public static void main(String... args) {
        Solution solution = new Solution();
        String skill = "CBD";
        String[] skillTrees = { "BACDE", "CBADF", "AECB", "BDA" };
        int result = solution.solution(skill, skillTrees);
        System.out.println(result);
    }
}