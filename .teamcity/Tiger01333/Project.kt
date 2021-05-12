package Tiger01333

import Tiger01333.buildTypes.*
import Tiger01333.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01333")
    name = "Tiger01333"

    vcsRoot(Tiger01333_cVCSroot)

    buildType(Tiger01333_Hi0)
    buildType(Tiger01333_Hi3)
    buildType(Tiger01333_Hi1)
    buildType(Tiger01333_Hi2)
})
