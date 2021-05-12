package Tiger01142

import Tiger01142.buildTypes.*
import Tiger01142.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01142")
    name = "Tiger01142"

    vcsRoot(Tiger01142_cVCSroot)

    buildType(Tiger01142_Hi1)
    buildType(Tiger01142_Hi2)
    buildType(Tiger01142_Hi3)
    buildType(Tiger01142_Hi0)
})
