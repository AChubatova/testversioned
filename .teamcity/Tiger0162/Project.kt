package Tiger0162

import Tiger0162.buildTypes.*
import Tiger0162.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0162")
    name = "Tiger0162"

    vcsRoot(Tiger0162_cVCSroot)

    buildType(Tiger0162_Hi2)
    buildType(Tiger0162_Hi3)
    buildType(Tiger0162_Hi0)
    buildType(Tiger0162_Hi1)
})
