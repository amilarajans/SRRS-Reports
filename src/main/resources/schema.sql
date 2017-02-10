SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tsd-srrs`
--
CREATE DATABASE IF NOT EXISTS `tsd_srrs` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
USE `tsd_srrs`;

-- --------------------------------------------------------

--
-- Table structure for table `availabilities`
--

CREATE TABLE `availabilities` (
  `id` int(10) UNSIGNED NOT NULL,
  `resource_id` int(10) UNSIGNED NOT NULL,
  `start` datetime NOT NULL,
  `end` datetime NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `icon` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `color` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`id`, `name`, `description`, `created_at`, `updated_at`, `icon`, `color`) VALUES
  (1, 'A', 'Et dolores magni a dolorem ullam repellat.', '2017-02-05 04:01:56', '2017-02-05 04:01:56', '3fc3df51bca3d01fde532bb44614245b.jpg', '#f30397'),
  (2, 'Eum', 'Molestias est tenetur iste eos.', '2017-02-05 04:01:58', '2017-02-05 04:01:58', 'b9ca894d60191d7aa7e8e799d0d0836b.jpg', '#a858a2'),
  (3, 'Ullam', 'Iure sit distinctio quia sit deleniti ipsam.', '2017-02-05 04:01:59', '2017-02-05 04:01:59', '95fd98d086a9bcf73266a050fca7ae4f.jpg', '#137700'),
  (4, 'Tempore', 'Amet ut blanditiis quo doloribus earum sint.', '2017-02-05 04:02:01', '2017-02-05 04:02:01', '9835c05c94cac4f79acff5dfece723e8.jpg', '#e7f0b5'),
  (5, 'Sed', 'Architecto quia porro quod recusandae pariatur.', '2017-02-05 04:02:03', '2017-02-05 04:02:03', '54055c3217fc4b16a5784e27bab5a17b.jpg', '#a664d9'),
  (6, 'Architecto', 'Magnam tempore voluptas laborum voluptatem.', '2017-02-05 04:02:04', '2017-02-05 04:02:04', 'bb93dc74a0e9225ac019bd6bcbd2bf2e.jpg', '#f5c841'),
  (7, 'Impedit', 'Laboriosam omnis quidem laudantium.', '2017-02-05 04:02:06', '2017-02-05 04:02:06', '64fbdd0144d1b140432597f3d541601f.jpg', '#3944dd'),
  (8, 'Minima', 'Iste facilis sit nam quia quis et omnis.', '2017-02-05 04:02:09', '2017-02-05 04:02:09', '8857ec1a7732130e8f8eadca28c4c762.jpg', '#5fbd51'),
  (9, 'Tenetur', 'Quia alias dolorem eveniet sed laborum dolor.', '2017-02-05 04:02:10', '2017-02-05 04:02:10', '5e075fce46fa7b016fe16bfc7a98b9ea.jpg', '#5a335b'),
  (10, 'Id', 'Amet molestiae voluptas aliquam qui.', '2017-02-05 04:02:12', '2017-02-05 04:02:12', 'ff49b608879743bc26b3ba5acfb6a8a8.jpg', '#1b35e3');

-- --------------------------------------------------------

--
-- Table structure for table `migrations`
--

CREATE TABLE `migrations` (
  `migration` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `batch` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `migrations`
--

INSERT INTO `migrations` (`migration`, `batch`) VALUES
  ('2014_10_12_000000_create_users_table', 1),
  ('2014_10_12_100000_create_password_resets_table', 1),
  ('2017_01_08_170455_create_categories_table', 1),
  ('2017_01_11_220327_create_resources_table', 1),
  ('2017_01_27_233059_create_availabilities_table', 1),
  ('2017_01_27_233906_create_reservations_table', 1),
  ('2017_01_30_183355_add_icon_to_categories_table', 1),
  ('2017_02_01_203940_add_reservations_to_reservations_table', 1),
  ('2017_02_02_224105_create_students_table', 1),
  ('2017_02_02_224125_create_staff_table', 1),
  ('2017_02_04_232712_add_color_to_categories_table', 1),
  ('2017_02_05_061232_create_permission_tables', 1);

-- --------------------------------------------------------

--
-- Table structure for table `password_resets`
--

CREATE TABLE `password_resets` (
  `email` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `token` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `permissions`
--

CREATE TABLE `permissions` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `reservations`
--

CREATE TABLE `reservations` (
  `id` int(10) UNSIGNED NOT NULL,
  `resource_id` int(10) UNSIGNED NOT NULL,
  `user_id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `address` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `nic_number` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `conact_number` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `email_address` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `start` datetime NOT NULL,
  `end` datetime NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `reservations`
--

INSERT INTO `reservations` (`id`, `resource_id`, `user_id`, `name`, `address`, `nic_number`, `conact_number`, `email_address`, `start`, `end`, `created_at`, `updated_at`) VALUES
  (1, 2, '', 'Ut', 'Optio nobis asperiores.', 'animi', '229', 'quibusdam', '2017-02-05 09:32:13', '2017-02-05 09:32:13', '2017-02-05 04:02:13', '2017-02-05 04:02:13'),
  (2, 5, '', 'Ut', 'Optio maiores unde.', 'quia', '499', 'ut', '2017-02-05 09:32:13', '2017-02-05 09:32:13', '2017-02-05 04:02:13', '2017-02-05 04:02:13'),
  (3, 9, '', 'Molestiae', 'Quis sapiente est.', 'officia', '413', 'quae', '2017-02-05 09:32:13', '2017-02-05 09:32:13', '2017-02-05 04:02:13', '2017-02-05 04:02:13'),
  (4, 10, '', 'Est', 'Dolores nostrum tempora.', 'adipisci', '364', 'nihil', '2017-02-05 09:32:13', '2017-02-05 09:32:13', '2017-02-05 04:02:13', '2017-02-05 04:02:13'),
  (5, 1, '', 'At', 'Assumenda nisi.', 'illo', '423', 'iusto', '2017-02-05 09:32:13', '2017-02-05 09:32:13', '2017-02-05 04:02:13', '2017-02-05 04:02:13'),
  (6, 1, '', 'Ex', 'Quas rerum eveniet.', 'id', '230', 'facilis', '2017-02-05 09:32:13', '2017-02-05 09:32:13', '2017-02-05 04:02:13', '2017-02-05 04:02:13'),
  (7, 2, '', 'Aut', 'Iusto accusamus.', 'eum', '908', 'necessitatibus', '2017-02-05 09:32:13', '2017-02-05 09:32:13', '2017-02-05 04:02:13', '2017-02-05 04:02:13'),
  (8, 6, '', 'Optio', 'Odio temporibus velit.', 'sunt', '737', 'est', '2017-02-05 09:32:13', '2017-02-05 09:32:13', '2017-02-05 04:02:13', '2017-02-05 04:02:13'),
  (9, 3, '', 'Rerum', 'Sed blanditiis quis.', 'ipsum', '120', 'odio', '2017-02-05 09:32:13', '2017-02-05 09:32:13', '2017-02-05 04:02:13', '2017-02-05 04:02:13'),
  (10, 7, '', 'Vel', 'Consequatur et tempore.', 'similique', '389', 'molestias', '2017-02-05 09:32:13', '2017-02-05 09:32:13', '2017-02-05 04:02:13', '2017-02-05 04:02:13');

-- --------------------------------------------------------

--
-- Table structure for table `resources`
--

CREATE TABLE `resources` (
  `id` int(10) UNSIGNED NOT NULL,
  `category_id` int(10) UNSIGNED NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `location` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `resources`
--

INSERT INTO `resources` (`id`, `category_id`, `name`, `location`, `description`, `created_at`, `updated_at`) VALUES
  (1, 8, 'Quis', 'Recusandae voluptate.', 'Eos similique rerum nam saepe aut.', '2017-02-05 04:02:12', '2017-02-05 04:02:12'),
  (2, 1, 'Ducimus', 'Laboriosam numquam nostrum.', 'Ipsam quasi atque sint dolores possimus at.', '2017-02-05 04:02:12', '2017-02-05 04:02:12'),
  (3, 5, 'Cum', 'Nobis maxime aspernatur.', 'Autem qui saepe reiciendis.', '2017-02-05 04:02:12', '2017-02-05 04:02:12'),
  (4, 3, 'Laborum', 'Enim dolores.', 'Fugit et aut et.', '2017-02-05 04:02:12', '2017-02-05 04:02:12'),
  (5, 9, 'Aliquid', 'Veniam deleniti.', 'Odio maxime sed omnis quae facere sit perferendis atque.', '2017-02-05 04:02:12', '2017-02-05 04:02:12'),
  (6, 9, 'Aut', 'Eum et.', 'Exercitationem sint totam possimus.', '2017-02-05 04:02:12', '2017-02-05 04:02:12'),
  (7, 7, 'Reprehenderit', 'Ullam totam.', 'Adipisci est perferendis soluta consequatur rerum non.', '2017-02-05 04:02:12', '2017-02-05 04:02:12'),
  (8, 8, 'Adipisci', 'Libero sint vitae.', 'Libero ex dolor est ut tempore voluptas quae.', '2017-02-05 04:02:12', '2017-02-05 04:02:12'),
  (9, 3, 'Doloribus', 'Nostrum velit.', 'Non sit a odio ut ut cumque totam et.', '2017-02-05 04:02:12', '2017-02-05 04:02:12'),
  (10, 5, 'Laborum', 'Deleniti aut.', 'Mollitia officia non adipisci pariatur error quod sunt id.', '2017-02-05 04:02:12', '2017-02-05 04:02:12');

-- --------------------------------------------------------

--
-- Table structure for table `role_has_permissions`
--

CREATE TABLE `role_has_permissions` (
  `permission_id` int(10) UNSIGNED NOT NULL,
  `role_id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE `roles` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `id` int(10) UNSIGNED NOT NULL,
  `reg_id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `pin` int(10) UNSIGNED NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `date_of_birth` datetime NOT NULL,
  `address` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `email_address` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `contact_number` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `post` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`id`, `reg_id`, `pin`, `name`, `date_of_birth`, `address`, `email_address`, `contact_number`, `post`, `created_at`, `updated_at`) VALUES
  (1, 'as-99', 696, 'Vladimir Kuhic', '2017-02-05 09:31:54', 'Nisi quae.', 'staff@srrs.app', '94777278818', 'hic', '2017-02-05 04:01:54', '0000-00-00 00:00:00'),
  (2, 'as-620', 154, 'Colton Pfannerstill', '2017-02-05 09:31:54', 'Aliquam adipisci.', 'staff@srrs.app', '94773789094', 'fugit', '2017-02-05 04:01:54', '0000-00-00 00:00:00'),
  (3, 'as-680', 635, 'Mallie DuBuque', '2017-02-05 09:31:54', 'Rerum est.', 'staff@srrs.app', '94773789094', 'repudiandae', '2017-02-05 04:01:54', '0000-00-00 00:00:00'),
  (4, 'as-676', 876, 'Prof. Judah Beier', '2017-02-05 09:31:54', 'Hic sunt.', 'staff@srrs.app', '94773789094', 'dicta', '2017-02-05 04:01:54', '0000-00-00 00:00:00'),
  (5, 'as-682', 292, 'Carson Nikolaus', '2017-02-05 09:31:54', 'Vel saepe consectetur.', 'staff@srrs.app', '94773789094', 'nulla', '2017-02-05 04:01:54', '0000-00-00 00:00:00'),
  (6, 'nas-785', 577, 'Luther Halvorson IV', '2017-02-05 09:31:54', 'Consequatur labore beatae.', 'staff@srrs.app', '94773789094', 'provident', '2017-02-05 04:01:54', '0000-00-00 00:00:00'),
  (7, 'nas-225', 214, 'Keshawn Pfannerstill', '2017-02-05 09:31:54', 'Aspernatur sit reprehenderit.', 'staff@srrs.app', '94773789094', 'magni', '2017-02-05 04:01:54', '0000-00-00 00:00:00'),
  (8, 'nas-673', 394, 'Miss Assunta Sauer DVM', '2017-02-05 09:31:54', 'Esse quia.', 'staff@srrs.app', '94773789094', 'ab', '2017-02-05 04:01:54', '0000-00-00 00:00:00'),
  (9, 'nas-299', 566, 'Melyssa Vandervort', '2017-02-05 09:31:54', 'Consectetur omnis est.', 'staff@srrs.app', '94773789094', 'est', '2017-02-05 04:01:54', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `id` int(10) UNSIGNED NOT NULL,
  `reg_id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `pin` int(10) UNSIGNED NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `date_of_birth` datetime NOT NULL,
  `address` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `email_address` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `contact_number` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `class` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`id`, `reg_id`, `pin`, `name`, `date_of_birth`, `address`, `email_address`, `contact_number`, `class`, `created_at`, `updated_at`) VALUES
  (1, 's-99', 957, 'Miss Carmella McCullough', '2017-02-05 09:31:53', 'Fugit ex.', 'student@srrs.app', '94777278818', '11B', '2017-02-05 04:01:53', '0000-00-00 00:00:00'),
  (2, 's-693', 224, 'Mr. Jackson Beatty DVM', '2017-02-05 09:31:53', 'Ducimus qui ex.', 'student@srrs.app', '94773789094', '11B', '2017-02-05 04:01:53', '0000-00-00 00:00:00'),
  (3, 's-511', 482, 'Mr. Rocio Stark II', '2017-02-05 09:31:53', 'Eum amet.', 'student@srrs.app', '94773789094', '11B', '2017-02-05 04:01:53', '0000-00-00 00:00:00'),
  (4, 's-816', 535, 'Jasmin Durgan', '2017-02-05 09:31:53', 'Autem repellendus.', 'student@srrs.app', '94773789094', '11B', '2017-02-05 04:01:53', '0000-00-00 00:00:00'),
  (5, 's-231', 792, 'Darron Fay', '2017-02-05 09:31:53', 'Rerum eligendi.', 'student@srrs.app', '94773789094', '11B', '2017-02-05 04:01:53', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `user_has_permissions`
--

CREATE TABLE `user_has_permissions` (
  `user_id` int(10) UNSIGNED NOT NULL,
  `permission_id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user_has_roles`
--

CREATE TABLE `user_has_roles` (
  `role_id` int(10) UNSIGNED NOT NULL,
  `user_id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `role` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `status` int(10) UNSIGNED NOT NULL,
  `activation_key` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `remember_token` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `email`, `password`, `role`, `status`, `activation_key`, `remember_token`, `created_at`, `updated_at`) VALUES
  (1, 'Michelle Kshlerin', 'admin@srrs.app', '$2y$10$8GErdBu6jVxkU7W.cgNAhufNVk.brH2Zc1TwLvzRLD/eZDTvjYjcK', 'admin', 1, 'eewlepeqpepweleqwel', NULL, '2017-02-05 04:01:52', '0000-00-00 00:00:00'),
  (2, 'Aric DuBuque', 'srutherford@auer.com', '$2y$10$DzIyU8N4ONrHQLhqBkIlS.QTE8qBdB0Rm0Yqud9UmdVYDcfPLLnr6', 'operator', 1, 'eewlepeqpepweleqwel', NULL, '2017-02-05 04:01:53', '2017-02-05 04:01:53'),
  (3, 'Ellsworth Pouros DVM', 'fdaugherty@lockman.com', '$2y$10$nhv75TXpfi4X9K/NXEkss.pPJaliNYR0nUrgLamHsMzeLItI4Kham', 'operator', 1, 'eewlepeqpepweleqwel', NULL, '2017-02-05 04:01:53', '2017-02-05 04:01:53'),
  (4, 'Ms. Rosalee Ernser DVM', 'ray54@hotmail.com', '$2y$10$H4q1O/vMPRg9p3l3SJeUH.LEa.oZ34fLcFi5f/MtBPIc3IfecilSq', 'operator', 1, 'eewlepeqpepweleqwel', NULL, '2017-02-05 04:01:53', '2017-02-05 04:01:53'),
  (5, 'Dr. Vito Greenholt', 'ben71@howell.biz', '$2y$10$pIDDQY/nzd4TJVoHUG3/D.W2VlYKeqRT1wQvmKM6UEY7b.fRYl1/W', 'operator', 1, 'eewlepeqpepweleqwel', NULL, '2017-02-05 04:01:53', '2017-02-05 04:01:53');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `availabilities`
--
ALTER TABLE `availabilities`
  ADD PRIMARY KEY (`id`),
  ADD KEY `availabilities_resource_id_foreign` (`resource_id`);

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `password_resets`
--
ALTER TABLE `password_resets`
  ADD KEY `password_resets_email_index` (`email`),
  ADD KEY `password_resets_token_index` (`token`);

--
-- Indexes for table `permissions`
--
ALTER TABLE `permissions`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `permissions_name_unique` (`name`);

--
-- Indexes for table `reservations`
--
ALTER TABLE `reservations`
  ADD PRIMARY KEY (`id`),
  ADD KEY `reservations_resource_id_foreign` (`resource_id`);

--
-- Indexes for table `resources`
--
ALTER TABLE `resources`
  ADD PRIMARY KEY (`id`),
  ADD KEY `resources_category_id_foreign` (`category_id`);

--
-- Indexes for table `role_has_permissions`
--
ALTER TABLE `role_has_permissions`
  ADD PRIMARY KEY (`permission_id`,`role_id`),
  ADD KEY `role_has_permissions_role_id_foreign` (`role_id`);

--
-- Indexes for table `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `roles_name_unique` (`name`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `staff_reg_id_unique` (`reg_id`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `students_reg_id_unique` (`reg_id`);

--
-- Indexes for table `user_has_permissions`
--
ALTER TABLE `user_has_permissions`
  ADD PRIMARY KEY (`user_id`,`permission_id`),
  ADD KEY `user_has_permissions_permission_id_foreign` (`permission_id`);

--
-- Indexes for table `user_has_roles`
--
ALTER TABLE `user_has_roles`
  ADD PRIMARY KEY (`role_id`,`user_id`),
  ADD KEY `user_has_roles_user_id_foreign` (`user_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `users_email_unique` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `availabilities`
--
ALTER TABLE `availabilities`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `categories`
--
ALTER TABLE `categories`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `permissions`
--
ALTER TABLE `permissions`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `reservations`
--
ALTER TABLE `reservations`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `resources`
--
ALTER TABLE `resources`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `roles`
--
ALTER TABLE `roles`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `staff`
--
ALTER TABLE `staff`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `availabilities`
--
ALTER TABLE `availabilities`
  ADD CONSTRAINT `availabilities_resource_id_foreign` FOREIGN KEY (`resource_id`) REFERENCES `resources` (`id`);

--
-- Constraints for table `reservations`
--
ALTER TABLE `reservations`
  ADD CONSTRAINT `reservations_resource_id_foreign` FOREIGN KEY (`resource_id`) REFERENCES `resources` (`id`);

--
-- Constraints for table `resources`
--
ALTER TABLE `resources`
  ADD CONSTRAINT `resources_category_id_foreign` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `role_has_permissions`
--
ALTER TABLE `role_has_permissions`
  ADD CONSTRAINT `role_has_permissions_permission_id_foreign` FOREIGN KEY (`permission_id`) REFERENCES `permissions` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `role_has_permissions_role_id_foreign` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `user_has_permissions`
--
ALTER TABLE `user_has_permissions`
  ADD CONSTRAINT `user_has_permissions_permission_id_foreign` FOREIGN KEY (`permission_id`) REFERENCES `permissions` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `user_has_permissions_user_id_foreign` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `user_has_roles`
--
ALTER TABLE `user_has_roles`
  ADD CONSTRAINT `user_has_roles_role_id_foreign` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `user_has_roles_user_id_foreign` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
