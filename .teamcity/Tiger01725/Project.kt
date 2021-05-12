package Tiger01725

import Tiger01725.buildTypes.*
import Tiger01725.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01725")
    name = "Tiger01725"

    vcsRoot(Tiger01725_cVCSroot)

    buildType(Tiger01725_Hi0)
    buildType(Tiger01725_Hi1)
    buildType(Tiger01725_Hi2)
    buildType(Tiger01725_Hi3)
})
