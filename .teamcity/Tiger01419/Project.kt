package Tiger01419

import Tiger01419.buildTypes.*
import Tiger01419.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01419")
    name = "Tiger01419"

    vcsRoot(Tiger01419_cVCSroot)

    buildType(Tiger01419_Hi3)
    buildType(Tiger01419_Hi2)
    buildType(Tiger01419_Hi1)
    buildType(Tiger01419_Hi0)
})
