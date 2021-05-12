package Tiger01345

import Tiger01345.buildTypes.*
import Tiger01345.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01345")
    name = "Tiger01345"

    vcsRoot(Tiger01345_cVCSroot)

    buildType(Tiger01345_Hi3)
    buildType(Tiger01345_Hi2)
    buildType(Tiger01345_Hi1)
    buildType(Tiger01345_Hi0)
})
