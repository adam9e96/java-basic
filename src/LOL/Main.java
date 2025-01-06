package LOL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Skill 클래스: 스킬의 이름과 데미지를 정의
class Skill {
    private String name;
    private double damage;

    public Skill(String name, double damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }
}

// Champion 클래스: 챔피언의 스탯과 레벨, 경험치, 스킬을 관리
class Champion {
    private final String name;
    private int level;
    private double currentExperience;
    private double experienceToNextLevel;

    // 기본 스탯
    private double baseHealth = 600;
    private double healthPerLevel = 110;
    private double baseHealthRegen = 3.25;
    private double healthRegenPerLevel = 0.7;
    private double baseMana = 250;
    private double manaPerLevel = 45;
    private double baseManaRegen = 6;
    private double manaRegenPerLevel = 0.8;
    private double baseAttackDamage = 56;
    private double attackDamagePerLevel = 2;
    private double baseAttackSpeed = 0.625;
    private double attackSpeedPerLevelPercent = 0.02; // 2%
    private double baseArmor = 24;
    private double armorPerLevel = 4.2;
    private double baseMR = 30;
    private double mrPerLevel = 1.3;
    private double attackRange = 500;
    private double moveSpeed = 330;

    // 현재 스탯
    private double health;
    private double healthRegen;
    private double mana;
    private double manaRegen;
    private double attackDamage;
    private double attackSpeed;
    private double armor;
    private double mr;

    // 스킬 목록
    List<Skill> skills;

    public Champion(String name) {
        this.name = name;
        this.level = 1;
        this.currentExperience = 0;
        this.experienceToNextLevel = 100; // 초기 레벨업 경험치

        // 초기 스탯 계산
        calculateStats();
        skills = new ArrayList<>();
    }

    private void calculateStats() {
        this.health = baseHealth + (level - 1) * healthPerLevel;
        this.healthRegen = baseHealthRegen + (level - 1) * healthRegenPerLevel;
        this.mana = baseMana + (level - 1) * manaPerLevel;
        this.manaRegen = baseManaRegen + (level - 1) * manaRegenPerLevel;
        this.attackDamage = baseAttackDamage + (level - 1) * attackDamagePerLevel;
        this.attackSpeed = baseAttackSpeed * Math.pow(1 + attackSpeedPerLevelPercent, level - 1);
        this.armor = baseArmor + (level - 1) * armorPerLevel;
        this.mr = baseMR + (level - 1) * mrPerLevel;
    }

    public void attack(Minion minion, String skillName) {
        double damage = 0;
        Skill chosenSkill = null;
        for (Skill skill : skills) {
            if (skill.getName().equalsIgnoreCase(skillName)) {
                chosenSkill = skill;
                break;
            }
        }

        if (chosenSkill != null) {
            damage = chosenSkill.getDamage() + attackDamage;
            System.out.println(name + " 가 스킬을 사용 " + chosenSkill.getName() + " 그리고 " + damage + " 데미지를 미니언에게 줌");
        } else {
            // 평타
            damage = attackDamage;
            System.out.println(name + " 가 평타를 사용하여 미니언에게 " + damage + " 데미지를 줌");
        }

        // 미니언이 피해를 입는 메소드
        minion.takeDamage(damage);
        if (!minion.isAlive()) {
            System.out.println("미니언이 죽었습니다. " + minion.getExperience() + " 경험치를 획득했습니다.");
            gainExperience(minion.getExperience());
        }
    }

    public void gainExperience(double exp) {
        currentExperience += exp;
        while (currentExperience >= experienceToNextLevel) {
            currentExperience -= experienceToNextLevel;
            levelUp();
        }
    }

    private void levelUp() {
        level++;
        System.out.println("레벨업함 " + level + "!");
        calculateStats();
        chooseSkill();
        // 증가되는 다음 레벨업 경험치
        experienceToNextLevel += 50; // 예시로 매 레벨마다 50씩 증가
    }

    private void chooseSkill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("배울 스킬을 고르세요.(Q, W, E, R): ");
        String skillChoice = scanner.nextLine().toUpperCase();
        Skill newSkill = null;
        switch (skillChoice) {
            case "Q":
                newSkill = new Skill("Q", 100 + 10 * level); // 예시 데미지
                break;
            case "W":
                newSkill = new Skill("W", 120 + 12 * level);
                break;
            case "E":
                newSkill = new Skill("E", 150 + 15 * level);
                break;
            case "R":
                newSkill = new Skill("R", 200 + 20 * level);
                break;
            default:
                System.out.println("Invalid skill choice. No skill learned.");
                return;
        }
        skills.add(newSkill);
        System.out.println("스킬을 배웠습니다 " + newSkill.getName() + " 스킬 데미지 : " + newSkill.getDamage());
    }

    public void displayStats() {
        System.out.println("----- " + name + " 상태 -----");
        System.out.println("레벨: " + level);
        System.out.println("체력: " + health);
        System.out.println("체력 재생: " + healthRegen);
        System.out.println("마나: " + mana);
        System.out.println("마나 재생: " + manaRegen);
        System.out.println("기본공격력: " + attackDamage);
        System.out.println("공격 속도: " + String.format("%.3f", attackSpeed));
        System.out.println("방어력: " + armor);
        System.out.println("마법 저항력: " + mr);
        System.out.println("공격 사거리: " + attackRange);
        System.out.println("이동속도: " + moveSpeed);
        System.out.println("현재 경험치: " + currentExperience + "/" + experienceToNextLevel);
        System.out.print("보유 스킬들: ");
        if (skills.isEmpty()) {
            System.out.println("None");
        } else {
            for (Skill skill : skills) {
                System.out.print(skill.getName() + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }
}

// Minion 클래스: 미니언의 체력과 경험치를 관리
class Minion {
    private double health;
    private double maxHealth;
    private double experience;

    public Minion(double health, double experience) {
        this.maxHealth = health;
        this.health = health;
        this.experience = experience;
    }

    public void takeDamage(double damage) {
        health -= damage;
        health = Math.max(health, 0);
        System.out.println("미니언 남은 체력: " + health + "/" + maxHealth);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public double getExperience() {
        return experience;
    }

    public double getHealth() {
        return health;
    }
}

// Main 클래스: 게임의 흐름을 제어하고 사용자와 상호작용

/**
 * 리그 오브 레전드의 챔피언인 제리(Zeri)가 미니언을 공격하여 경험치를 얻고
 * 레벨업하며 스킬(Q, W, E, R)을 선택하는 간단한 자바 콘솔 애플리케이션
 * 이 프로그램은 기본적인 게임 메커니즘을 모방하며, 챔피언의 스탯 관리, 미니언 공격, 경험치 획득 및 레벨업 시스템을 포함합니다.
 * <p>
 * 프로그램 구조
 * Champion 클래스: 제리의 스탯과 레벨, 경험치, 스킬을 관리합니다.
 * Minion 클래스: 미니언의 체력과 경험치를 관리합니다.
 * Skill 클래스: 스킬의 이름과 데미지를 관리합니다.
 * Main 클래스: 사용자와의 상호작용을 담당하며 게임의 흐름을 제어합니다.
 * 구현 단계
 * 챔피언의 스탯 초기화 및 레벨업 시스템 구현
 * 미니언 생성 및 공격 메커니즘 구현
 * 경험치 획득 및 레벨업 시 스킬 선택 기능 구현
 * 콘솔 기반 인터페이스를 통한 사용자 상호작용 구현
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Champion zeri = new Champion("Zeri");
        Minion minion = new Minion(300, 50);
        int count = 0;

        System.out.println("리그 오브 레전드: 제리 미니언 사냥 시뮬레이터");
        boolean running = true;

        while (running) {
            zeri.displayStats();
            if (!minion.isAlive()) {
                minion = new Minion(300, 50);
                count = 0;
            }
            System.out.println("할 행동을 고르세요:");
            System.out.println("1. 미니언을 공격");
            System.out.println("2. 상태 보기");
            System.out.println("3. 나가기");
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    count++;
                    // 미니언 생성 (예시: 체력 300, 경험치 50)

                    if (count == 0) {
                        System.out.println("미니언 1기 생성됨 (Health: 300)");
                    } else if (count > 0) {
                        System.out.println("미니언 1기 현재 체력 : " + minion.getHealth());
                    }


                    System.out.println("공격 유형을 선택하세요: ");
                    System.out.println("1. 기본공격");
                    if (!zeri.skills.isEmpty()) {
                        for (int i = 0; i < zeri.skills.size(); i++) {
                            System.out.println((i + 2) + ". " + zeri.skills.get(i).getName());
                        }
                    }
                    System.out.print("Enter choice: ");
                    String attackChoice = scanner.nextLine();
                    String skillName = "";
                    if (attackChoice.equals("1")) {
                        skillName = ""; // 평타
                    } else {
                        int skillIndex = Integer.parseInt(attackChoice) - 2;
                        if (skillIndex >= 0 && skillIndex < zeri.skills.size()) {
                            skillName = zeri.skills.get(skillIndex).getName();
                        } else {
                            System.out.println("잘못된 스킬선택. 기본공격을 하겠습니다.");
                        }
                    }
                    zeri.attack(minion, skillName);
                    break;
                case "2":
                    zeri.displayStats();
                    break;
                case "3":
                    running = false;
                    System.out.println("게임 종료.");
                    break;
                default:
                    System.out.println("잘못된 선택. 다시선택하세요.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
