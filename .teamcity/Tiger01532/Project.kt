package Tiger01532

import Tiger01532.buildTypes.*
import Tiger01532.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01532")
    name = "Tiger01532"

    vcsRoot(Tiger01532_cVCSroot)

    buildType(Tiger01532_Hi0)
    buildType(Tiger01532_Hi1)
    buildType(Tiger01532_Hi2)
    buildType(Tiger01532_Hi3)
})
